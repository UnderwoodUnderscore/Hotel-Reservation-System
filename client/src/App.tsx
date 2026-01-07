import { useState } from 'react';
import Header from './components/Header';
import Feature from './components/Feature';
import SideContent from './components/SideContent.tsx';
import Profile from './components/Profile';

export default function Page() {

	const [showLanding, setShowLanding] = useState(true);
	const [showProfile, setShowProfile] = useState(false);
	const [showBooking, setShowBooking] = useState(false);
	
	function handleProfile() {
		setShowLanding(false);
		setShowProfile(true);
	}

	function handleBooking() {
		setShowBooking(!showBooking);
	}

	return (
		<>
			<Header onProfile={handleProfile} />
			{showLanding && <Feature room='Featured Luxury Apartment' price='699' amenities={[{'Front Beach' : '3 Bedrooms'}, {'Jacuzzi' : '3 Bathrooms'}, {'Concierge' : '24 hours'}]} onBooking={handleBooking} />}
			{showBooking && <SideContent side='right' onBooking={handleBooking} />}
			{showProfile && <Profile />}
		</>
	)
}