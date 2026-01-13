import Header from './Header';
import Feature from './Feature';
import Form from './Forms';

export default function MainContent() {

    const isAdmin = false;

    const guestLanding = (
        <>
            <div className='intro'>
                <h1>Find Your Perfect Place to Stay</h1>
                <p>Conveniently aggregate interoperable value after cross functional innovation.
                    Enthusiastically transition innovative web services before future-proof.
                </p>

                <Feature imageSrc='https://picsum.photos/1400/900' imageAlt='random image placeholder' />

                <Form type='booking' />
            </div>
        </>
    );

    const adminLanding = (
        <>
        </>
    );

    const Settings = (
        <>
        </>
    );

    const Profile = (
        <>
        </>
    );

    return (
        <>
            <Header />
            {!isAdmin && guestLanding}
            {isAdmin && adminLanding}
        </>
    )
}