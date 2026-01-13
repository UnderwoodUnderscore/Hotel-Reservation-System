import Header from './Header';
import Feature from './Feature';

export default function MainContent() {

    const isAdmin = false;

    const guestLanding = (
        <>
            <div className='intro'>
                <h1>Find Your Perfect Place to Stay</h1>
                <p>Conveniently aggregate interoperable value after cross functional innovation.
                    Enthusiastically transition innovative web services before future-proof.
                </p>

                <Feature imageSrc='https://picsum.photos/1400/700' imageAlt='random image placeholder' />
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