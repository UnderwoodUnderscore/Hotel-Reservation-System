import Header from './Header';
import Feature from './Feature';
import Form from './Forms';

export default function MainContent({ content }) {

    const isAdmin = false;

    const Home = ShowHome(isAdmin);
    const Settings = ShowSettings();
    const Profile = ShowProfile();

    let page = {"Home" : Home, "Settings" : Settings, "Profile" : Profile};

    return (
        <section className='mainContent'>
            {page[content]}
        </section>
    )
}

function ShowHome( isAdmin: boolean) {
    if (isAdmin) {
        return (
            <>
            </>
        );

    } else {
        return (
            <div className='intro'>
                <h1>Find Your Perfect Place to Stay</h1>
                <p>Conveniently aggregate interoperable value after cross functional innovation.
                    Enthusiastically transition innovative web services before future-proof.
                </p>

                <Feature imgSrc='https://picsum.photos/1400/900' />

                <Form type='booking' />
            </div>
        );
    }
}

function ShowSettings() {

    return (
        <>

        </>
    )
}

function ShowProfile() {

    return (
        <>

        </>
    )
}